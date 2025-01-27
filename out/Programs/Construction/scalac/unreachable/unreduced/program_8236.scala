package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Boolean], c: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: CC_B, c: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_D[D](a: CC_C, b: T_B[CC_C, D], c: CC_B) extends T_B[CC_C, D]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)