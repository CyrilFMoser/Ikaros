package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Boolean, Boolean], T_B[Boolean, Boolean]], b: T_B[T_A[Byte, Char], Byte], c: T_B[Boolean, (Char,Int)]) extends T_A[Int, T_A[Char, (Boolean,Int)]]
case class CC_B() extends T_A[Int, T_A[Char, (Boolean,Int)]]
case class CC_C[E](a: T_B[E, CC_A]) extends T_B[E, CC_A]
case class CC_D[F]() extends T_B[F, CC_A]

val v_a: T_A[Int, T_A[Char, (Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}