package com.mrcrayfish.furniture.refurbished.client.gui.screen;

import com.google.common.base.MoreObjects;
import com.mrcrayfish.furniture.refurbished.util.Utils;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Function;

/**
 * Author: MrCrayfish
 */
public class TextInputScreen extends Screen
{
    private static final ResourceLocation WINDOW_SPRITE = Utils.resource("window");
    public static final int WINDOW_WIDTH = 160;
    public static final int WINDOW_HEIGHT = 72;

    protected final Component hint;
    protected final Function<String, Boolean> callback;
    protected Function<String, Boolean> validator = s -> true;
    protected EditBox editBox;
    protected Button closeButton;
    protected Button acceptButton;
    protected Component acceptLabel;
    protected String input = "";

    public TextInputScreen(Component title, Component hint, Function<String, Boolean> callback)
    {
        super(title);
        this.hint = hint;
        this.callback = callback;
    }

    public void setValidator(Function<String, Boolean> validator)
    {
        this.validator = validator;
    }

    public void setAcceptLabel(Component acceptLabel)
    {
        this.acceptLabel = acceptLabel;
    }

    @Override
    protected void init()
    {
        int startX = (this.width - WINDOW_WIDTH) / 2;
        int startY = (this.height - WINDOW_HEIGHT) / 2;
        this.addRenderableWidget(this.editBox = new EditBox(this.minecraft.font, startX + 6, startY + 20, WINDOW_WIDTH - 12, 20, this.hint));
        this.editBox.setResponder(this::updateAcceptButton);
        if(!this.input.isBlank())
        {
            this.editBox.setValue(this.input);
        }
        this.addRenderableWidget(this.closeButton = Button.builder(Component.literal("Close"), btn -> {
            this.minecraft.setScreen(null);
        }).pos(startX + 6, startY + 45).size((WINDOW_WIDTH - 12) / 2 - 2, 20).build());
        this.addRenderableWidget(this.acceptButton = Button.builder(MoreObjects.firstNonNull(this.acceptLabel, Component.literal("Accept")), btn -> {
            if(this.callback.apply(this.input)) {
                this.minecraft.setScreen(null);
            }
        }).pos(startX + (WINDOW_WIDTH - 12) / 2 + 2 + 6, startY + 45).size((WINDOW_WIDTH - 12) / 2 - 2, 20).build());
        this.updateAcceptButton(this.input);
    }

    private void updateAcceptButton(String input)
    {
        boolean valid = this.validator.apply(input);
        this.editBox.setTextColor(valid ? 0xFFFFFF : 0xFF0000);
        this.acceptButton.active = valid;
        this.input = input;
    }

    @Override
    public void renderBackground(GuiGraphics graphics, int mouseX, int mouseY, float partialTick)
    {
        super.renderBackground(graphics, mouseX, mouseY, partialTick);
        int startX = (this.width - WINDOW_WIDTH) / 2;
        int startY = (this.height - WINDOW_HEIGHT) / 2;
        graphics.blitSprite(WINDOW_SPRITE, startX, startY, WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick)
    {
        super.render(graphics, mouseX, mouseY, partialTick);
        int startX = (this.width - WINDOW_WIDTH) / 2;
        int startY = (this.height - WINDOW_HEIGHT) / 2;
        graphics.drawString(this.minecraft.font, this.title, startX + 6, startY + 7, 0x404040, false);
    }
}
