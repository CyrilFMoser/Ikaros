package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (T_A[Int, Char],Char)) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]]) extends T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]]
case class CC_C(a: T_A[Byte, T_A[Byte, Byte]]) extends T_A[Byte, T_A[Byte, Byte]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_C(_) => 1 
}
}