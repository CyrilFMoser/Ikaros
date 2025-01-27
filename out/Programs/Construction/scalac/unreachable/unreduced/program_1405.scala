package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_B[Char]]]
case class CC_B(a: CC_A[Char], b: T_B[(Byte,Boolean)], c: CC_A[Char]) extends T_A[T_A[T_B[Byte], T_A[Char, (Int,Byte)]], T_B[T_B[Char]]]

val v_a: T_A[T_A[T_B[Byte], T_A[Char, (Int,Byte)]], T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}