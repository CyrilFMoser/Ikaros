package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean, b: (T_B[Byte, (Char,Int)],T_B[Int, Char]), c: Byte) extends T_A[T_A[Int, T_A[(Char,Boolean), Int]], Int]
case class CC_B(a: CC_A, b: T_B[Char, T_B[Int, (Char,Boolean)]]) extends T_A[T_A[Int, T_A[(Char,Boolean), Int]], Int]
case class CC_C() extends T_A[T_A[Int, T_A[(Char,Boolean), Int]], Int]
case class CC_D[E](a: Int) extends T_B[E, CC_A]
case class CC_E[F](a: T_B[F, CC_A], b: T_B[F, CC_A]) extends T_B[F, CC_A]
case class CC_F(a: Byte, b: T_B[T_A[(Boolean,Char), CC_C], CC_A], c: CC_B) extends T_B[CC_A, CC_A]

val v_a: T_A[T_A[Int, T_A[(Char,Boolean), Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(CC_A(_, (_,_), _), _) => 1 
  case CC_C() => 2 
}
}