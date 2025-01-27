package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: Char, b: T_A[T_A[Byte, Char], (Boolean,Byte)]) extends T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]], T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]]]]
case class CC_C[D](a: T_A[D, D], b: D) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_C(_, _))) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}