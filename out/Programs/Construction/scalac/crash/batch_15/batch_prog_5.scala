package Program_5 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: Char, b: (Int,CC_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_B(CC_B(CC_A(), CC_A()), CC_A()) => 2 
  case CC_B(CC_B(CC_B(_, _), CC_A()), CC_A()) => 3 
  case CC_B(CC_C(_, (_,_)), CC_A()) => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _), CC_A()), CC_A())