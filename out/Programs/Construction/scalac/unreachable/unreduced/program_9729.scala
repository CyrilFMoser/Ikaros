package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], ((Byte,Boolean),Byte)], T_A[T_A[Int, (Char,Char)], T_A[Boolean, Int]]]
case class CC_B(a: CC_A[T_A[Byte, Boolean]]) extends T_A[T_A[T_A[Int, Char], ((Byte,Boolean),Byte)], T_A[T_A[Int, (Char,Char)], T_A[Boolean, Int]]]
case class CC_C(a: CC_A[(CC_B,CC_B)], b: ((CC_B,CC_B),CC_A[CC_B]), c: CC_A[(CC_B,CC_B)]) extends T_A[T_A[T_A[Int, Char], ((Byte,Boolean),Byte)], T_A[T_A[Int, (Char,Char)], T_A[Boolean, Int]]]

val v_a: T_A[T_A[T_A[Int, Char], ((Byte,Boolean),Byte)], T_A[T_A[Int, (Char,Char)], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
}
}
// This is not matched: CC_C(_, _, CC_A(_))