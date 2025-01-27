package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,(T_B,T_B)), b: Byte) extends T_A[Boolean]
case class CC_B(a: T_B, b: T_A[T_B], c: CC_A) extends T_A[Boolean]
case class CC_C() extends T_B
case class CC_D(a: CC_B, b: Boolean, c: (CC_B,CC_C)) extends T_B
case class CC_E(a: CC_D, b: CC_C) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _, _),(_,_)), _) => 0 
  case CC_A((CC_E(_, _),(_,_)), _) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_A((CC_C(),(_,_)), _)