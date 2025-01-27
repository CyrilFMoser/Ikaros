package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Byte, T_B[Boolean, (Boolean,Char)]], b: T_B[T_A[Char, Byte], T_B[Boolean, Int]], c: T_A[T_B[Byte, Int], T_B[(Byte,Boolean), Boolean]]) extends T_A[T_A[T_A[Byte, Byte], T_B[Boolean, Char]], Char]
case class CC_B[E](a: (T_A[Int, CC_A],T_B[Byte, CC_A])) extends T_B[T_B[T_B[(Boolean,Boolean), CC_A], CC_A], E]
case class CC_C[F](a: Boolean, b: Boolean) extends T_B[T_B[T_B[(Boolean,Boolean), CC_A], CC_A], F]
case class CC_D[G](a: CC_A) extends T_B[T_B[T_B[(Boolean,Boolean), CC_A], CC_A], G]

val v_a: T_B[T_B[T_B[(Boolean,Boolean), CC_A], CC_A], Char] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_A(_, _, _)) => 2 
}
}