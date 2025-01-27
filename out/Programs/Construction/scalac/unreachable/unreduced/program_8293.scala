package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Byte, c: Int) extends T_A[Byte]
case class CC_B(a: CC_A) extends T_A[Byte]
case class CC_C(a: (CC_B,(CC_A,CC_B)), b: CC_B) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(_, _) => 2 
}
}