package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_A[(Int,Byte), Byte]]]
case class CC_B(a: CC_A[Boolean], b: Boolean) extends T_A[Char, T_B[T_A[(Int,Byte), Byte]]]

val v_a: T_A[Char, T_B[T_A[(Int,Byte), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}