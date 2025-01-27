package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Boolean], (Char,Boolean)], b: T_A[Char, T_A[Int, Boolean]]) extends T_A[T_A[T_A[Int, Int], T_B[Char]], T_B[T_A[Char, Byte]]]
case class CC_B[D](a: Boolean, b: T_B[D]) extends T_B[D]
case class CC_C[E](a: Char, b: (T_A[CC_A, (Int,Byte)],CC_B[CC_A])) extends T_B[E]

val v_a: T_B[T_A[T_A[T_A[Int, Int], T_B[Char]], T_B[T_A[Char, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(true, _) => 0 
  case CC_B(false, _) => 1 
  case CC_C(_, (_,_)) => 2 
}
}