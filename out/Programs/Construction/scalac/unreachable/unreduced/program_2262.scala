package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: (Boolean,T_A)) extends T_B[T_B[Boolean, T_B[CC_A, CC_C]], C]
case class CC_E[D](a: Boolean, b: T_B[D, D], c: CC_A) extends T_B[T_B[Boolean, T_B[CC_A, CC_C]], D]

val v_a: T_B[T_B[Boolean, T_B[CC_A, CC_C]], CC_A] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_B(_, _))) => 0 
  case CC_D((_,CC_C(_))) => 1 
  case CC_E(_, _, CC_A(_)) => 2 
}
}
// This is not matched: CC_D((_,CC_A(_)))