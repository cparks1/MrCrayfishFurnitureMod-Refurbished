"use strict";(self.webpackChunkdocumentation=self.webpackChunkdocumentation||[]).push([[229],{8157:(e,t,n)=>{n.r(t),n.d(t,{assets:()=>u,contentTitle:()=>l,default:()=>m,frontMatter:()=>c,metadata:()=>o,toc:()=>d});var r=n(4848),a=n(8453),i=n(1470),s=n(9365);const c={sidebar_position:11,sidebar_label:"Workbench (Constructing)"},l="Workbench (Constructing)",o={id:"crafttweaker/recipes/workbench_constructing",title:"Workbench (Constructing)",description:"TODO",source:"@site/docs/crafttweaker/recipes/workbench_constructing.md",sourceDirName:"crafttweaker/recipes",slug:"/crafttweaker/recipes/workbench_constructing",permalink:"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/workbench_constructing",draft:!1,unlisted:!1,editUrl:"https://github.com/MrCrayfish/MrCrayfishFurnitureMod-Refurbished/tree/documentation/docs/crafttweaker/recipes/workbench_constructing.md",tags:[],version:"current",sidebarPosition:11,frontMatter:{sidebar_position:11,sidebar_label:"Workbench (Constructing)"},sidebar:"crafttweakerSidebar",previous:{title:"Toaster (Heating)",permalink:"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/toaster_heating"}},u={},d=[{value:"Recipe Manager",id:"recipe-manager",level:2},{value:"Custom Functions",id:"custom-functions",level:2},{value:"<code>addRecipe(name, result, materials[], notification]</code>",id:"addrecipename-result-materials-notification",level:3},{value:"Example",id:"example",level:4},{value:"Learn More",id:"learn-more",level:2}];function h(e){const t={a:"a",code:"code",h1:"h1",h2:"h2",h3:"h3",h4:"h4",hr:"hr",p:"p",pre:"pre",strong:"strong",table:"table",tbody:"tbody",td:"td",th:"th",thead:"thead",tr:"tr",...(0,a.R)(),...e.components};return(0,r.jsxs)(r.Fragment,{children:[(0,r.jsx)(t.h1,{id:"workbench-constructing",children:"Workbench (Constructing)"}),"\n",(0,r.jsx)(t.p,{children:"TODO"}),"\n",(0,r.jsx)(t.h2,{id:"recipe-manager",children:"Recipe Manager"}),"\n",(0,r.jsx)(t.p,{children:(0,r.jsx)(t.code,{children:"<recipetype:refurbished_furniture:workbench_constructing>"})}),"\n",(0,r.jsx)(t.h2,{id:"custom-functions",children:"Custom Functions"}),"\n",(0,r.jsx)(t.h3,{id:"addrecipename-result-materials-notification",children:(0,r.jsx)(t.code,{children:"addRecipe(name, result, materials[], notification]"})}),"\n",(0,r.jsx)(t.p,{children:"Adds a new constructing recipe to the workbench"}),"\n",(0,r.jsxs)(t.table,{children:[(0,r.jsx)(t.thead,{children:(0,r.jsxs)(t.tr,{children:[(0,r.jsx)(t.th,{style:{textAlign:"center"},children:"Paramater"}),(0,r.jsx)(t.th,{style:{textAlign:"center"},children:"Type"}),(0,r.jsx)(t.th,{style:{textAlign:"center"},children:"Required"}),(0,r.jsx)(t.th,{style:{textAlign:"center"},children:"Description"})]})}),(0,r.jsxs)(t.tbody,{children:[(0,r.jsxs)(t.tr,{children:[(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"name"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"string"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"Yes"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"The name of the recipe, must be unique."})]}),(0,r.jsxs)(t.tr,{children:[(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"result"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:(0,r.jsx)(t.a,{href:"https://docs.blamejared.com/1.20.4/en/vanilla/api/item/IItemStack",children:"IItemStack"})}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"Yes"}),(0,r.jsxs)(t.td,{style:{textAlign:"center"},children:["The resulting item from cooking the ",(0,r.jsx)(t.code,{children:"ingredient"}),", can have an amount."]})]}),(0,r.jsxs)(t.tr,{children:[(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"materials"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:(0,r.jsx)(t.a,{href:"https://docs.blamejared.com/1.20.4/en/vanilla/api/ingredient/IIngredient",children:"IIngredient[]"})}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"Yes"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"The ingredient to freeze"})]}),(0,r.jsxs)(t.tr,{children:[(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"notification"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"boolean"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"No"}),(0,r.jsx)(t.td,{style:{textAlign:"center"},children:"Show notifcation when player unlocks the recipe. Currently unused."})]})]})]}),"\n",(0,r.jsx)(t.h4,{id:"example",children:"Example"}),"\n",(0,r.jsxs)(i.A,{children:[(0,r.jsx)(s.A,{value:"zenscript",label:"ZenScript",default:!0,children:(0,r.jsx)(t.pre,{children:(0,r.jsx)(t.code,{className:"language-ts",metastring:'title="%gamedir%/scripts/example.zs"',children:'<recipetype:refurbished_furniture:workbench_constructing>.addRecipe(\n    "heating/easy_diamonds",\n    <item:minecraft:diamond> * 64, \n    [<item:minecraft:apple> * 3, <item:minecraft:stick> * 4],\n    false\n);\n'})})}),(0,r.jsx)(s.A,{value:"json",label:"Datapack Equivelant",children:(0,r.jsx)(t.pre,{children:(0,r.jsx)(t.code,{className:"language-json",metastring:'title="(ZIP File) \ud83e\udc62 /data/[namespace]/recipes/constructing/easy_diamonds.json"',children:'{\n    "type": "refurbished_furniture:workbench_constructing",\n    "materials": [\n        {\n            "ingredient": {\n                "item": "minecraft:apple"\n            },\n            "count": 3\n        },\n        {\n            "ingredient": {\n                "item": "minecraft:stick"\n            },\n            "count": 4\n        }\n    ],\n    "result": {\n        "item": "minecraft:diamond",\n        "count": 64\n    }\n}\n'})})})]}),"\n",(0,r.jsx)(t.hr,{}),"\n",(0,r.jsx)(t.h2,{id:"learn-more",children:"Learn More"}),"\n",(0,r.jsxs)(t.p,{children:["See ",(0,r.jsx)(t.strong,{children:"Recipe Managers"})," on the CraftTweaker ",(0,r.jsx)(t.a,{href:"https://docs.blamejared.com/1.20.4/en/tutorial/Recipes/RecipeManagers",children:"documentation"})," for all inbuilt functions."]})]})}function m(e={}){const{wrapper:t}={...(0,a.R)(),...e.components};return t?(0,r.jsx)(t,{...e,children:(0,r.jsx)(h,{...e})}):h(e)}},9365:(e,t,n)=>{n.d(t,{A:()=>s});n(6540);var r=n(4164);const a={tabItem:"tabItem_Ymn6"};var i=n(4848);function s(e){let{children:t,hidden:n,className:s}=e;return(0,i.jsx)("div",{role:"tabpanel",className:(0,r.A)(a.tabItem,s),hidden:n,children:t})}},1470:(e,t,n)=>{n.d(t,{A:()=>k});var r=n(6540),a=n(4164),i=n(3104),s=n(6347),c=n(205),l=n(7485),o=n(1682),u=n(9466);function d(e){return r.Children.toArray(e).filter((e=>"\n"!==e)).map((e=>{if(!e||(0,r.isValidElement)(e)&&function(e){const{props:t}=e;return!!t&&"object"==typeof t&&"value"in t}(e))return e;throw new Error(`Docusaurus error: Bad <Tabs> child <${"string"==typeof e.type?e.type:e.type.name}>: all children of the <Tabs> component should be <TabItem>, and every <TabItem> should have a unique "value" prop.`)}))?.filter(Boolean)??[]}function h(e){const{values:t,children:n}=e;return(0,r.useMemo)((()=>{const e=t??function(e){return d(e).map((e=>{let{props:{value:t,label:n,attributes:r,default:a}}=e;return{value:t,label:n,attributes:r,default:a}}))}(n);return function(e){const t=(0,o.X)(e,((e,t)=>e.value===t.value));if(t.length>0)throw new Error(`Docusaurus error: Duplicate values "${t.map((e=>e.value)).join(", ")}" found in <Tabs>. Every value needs to be unique.`)}(e),e}),[t,n])}function m(e){let{value:t,tabValues:n}=e;return n.some((e=>e.value===t))}function p(e){let{queryString:t=!1,groupId:n}=e;const a=(0,s.W6)(),i=function(e){let{queryString:t=!1,groupId:n}=e;if("string"==typeof t)return t;if(!1===t)return null;if(!0===t&&!n)throw new Error('Docusaurus error: The <Tabs> component groupId prop is required if queryString=true, because this value is used as the search param name. You can also provide an explicit value such as queryString="my-search-param".');return n??null}({queryString:t,groupId:n});return[(0,l.aZ)(i),(0,r.useCallback)((e=>{if(!i)return;const t=new URLSearchParams(a.location.search);t.set(i,e),a.replace({...a.location,search:t.toString()})}),[i,a])]}function f(e){const{defaultValue:t,queryString:n=!1,groupId:a}=e,i=h(e),[s,l]=(0,r.useState)((()=>function(e){let{defaultValue:t,tabValues:n}=e;if(0===n.length)throw new Error("Docusaurus error: the <Tabs> component requires at least one <TabItem> children component");if(t){if(!m({value:t,tabValues:n}))throw new Error(`Docusaurus error: The <Tabs> has a defaultValue "${t}" but none of its children has the corresponding value. Available values are: ${n.map((e=>e.value)).join(", ")}. If you intend to show no default tab, use defaultValue={null} instead.`);return t}const r=n.find((e=>e.default))??n[0];if(!r)throw new Error("Unexpected error: 0 tabValues");return r.value}({defaultValue:t,tabValues:i}))),[o,d]=p({queryString:n,groupId:a}),[f,b]=function(e){let{groupId:t}=e;const n=function(e){return e?`docusaurus.tab.${e}`:null}(t),[a,i]=(0,u.Dv)(n);return[a,(0,r.useCallback)((e=>{n&&i.set(e)}),[n,i])]}({groupId:a}),x=(()=>{const e=o??f;return m({value:e,tabValues:i})?e:null})();(0,c.A)((()=>{x&&l(x)}),[x]);return{selectedValue:s,selectValue:(0,r.useCallback)((e=>{if(!m({value:e,tabValues:i}))throw new Error(`Can't select invalid tab value=${e}`);l(e),d(e),b(e)}),[d,b,i]),tabValues:i}}var b=n(2303);const x={tabList:"tabList__CuJ",tabItem:"tabItem_LNqP"};var g=n(4848);function j(e){let{className:t,block:n,selectedValue:r,selectValue:s,tabValues:c}=e;const l=[],{blockElementScrollPositionUntilNextRender:o}=(0,i.a_)(),u=e=>{const t=e.currentTarget,n=l.indexOf(t),a=c[n].value;a!==r&&(o(t),s(a))},d=e=>{let t=null;switch(e.key){case"Enter":u(e);break;case"ArrowRight":{const n=l.indexOf(e.currentTarget)+1;t=l[n]??l[0];break}case"ArrowLeft":{const n=l.indexOf(e.currentTarget)-1;t=l[n]??l[l.length-1];break}}t?.focus()};return(0,g.jsx)("ul",{role:"tablist","aria-orientation":"horizontal",className:(0,a.A)("tabs",{"tabs--block":n},t),children:c.map((e=>{let{value:t,label:n,attributes:i}=e;return(0,g.jsx)("li",{role:"tab",tabIndex:r===t?0:-1,"aria-selected":r===t,ref:e=>l.push(e),onKeyDown:d,onClick:u,...i,className:(0,a.A)("tabs__item",x.tabItem,i?.className,{"tabs__item--active":r===t}),children:n??t},t)}))})}function v(e){let{lazy:t,children:n,selectedValue:a}=e;const i=(Array.isArray(n)?n:[n]).filter(Boolean);if(t){const e=i.find((e=>e.props.value===a));return e?(0,r.cloneElement)(e,{className:"margin-top--md"}):null}return(0,g.jsx)("div",{className:"margin-top--md",children:i.map(((e,t)=>(0,r.cloneElement)(e,{key:t,hidden:e.props.value!==a})))})}function y(e){const t=f(e);return(0,g.jsxs)("div",{className:(0,a.A)("tabs-container",x.tabList),children:[(0,g.jsx)(j,{...e,...t}),(0,g.jsx)(v,{...e,...t})]})}function k(e){const t=(0,b.A)();return(0,g.jsx)(y,{...e,children:d(e.children)},String(t))}},8453:(e,t,n)=>{n.d(t,{R:()=>s,x:()=>c});var r=n(6540);const a={},i=r.createContext(a);function s(e){const t=r.useContext(i);return r.useMemo((function(){return"function"==typeof e?e(t):{...t,...e}}),[t,e])}function c(e){let t;return t=e.disableParentContext?"function"==typeof e.components?e.components(a):e.components||a:s(e.components),r.createElement(i.Provider,{value:t},e.children)}}}]);