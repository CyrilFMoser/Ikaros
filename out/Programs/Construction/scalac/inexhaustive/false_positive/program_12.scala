package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[((Byte,Byte),Byte)], b: T_A[T_B[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_D[D]() extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_D(), _)) => 1 
}
}
// This is not matched: CC_C(_)