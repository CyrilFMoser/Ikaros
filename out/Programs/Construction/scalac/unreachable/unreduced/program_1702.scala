package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, (Char,Int)]]) extends T_A[T_B[T_A[Int], T_A[Byte]]]
case class CC_B(a: T_B[T_A[CC_A], T_B[CC_A, CC_A]], b: CC_A) extends T_A[T_B[T_A[Int], T_A[Byte]]]

val v_a: T_A[T_B[T_A[Int], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}