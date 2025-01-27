package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[T_A[Char, (Char,Byte)], T_A[Int, Int]]) extends T_A[Char, T_A[T_A[Char, Char], T_A[Char, Byte]]]
case class CC_B(a: CC_A) extends T_A[Char, T_A[T_A[Char, Char], T_A[Char, Byte]]]
case class CC_C(a: T_A[(CC_A,CC_A), CC_A], b: CC_B) extends T_A[Char, T_A[T_A[Char, Char], T_A[Char, Byte]]]

val v_a: T_A[Char, T_A[T_A[Char, Char], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}