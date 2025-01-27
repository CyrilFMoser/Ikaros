package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[E, E]) extends T_A[E, D]
case class CC_B[G, F](a: T_B[F], b: T_A[G, F], c: Char) extends T_A[G, F]
case class CC_C(a: CC_A[T_A[Int, Int], T_A[Boolean, Boolean]], b: ((Byte,Int),(Boolean,Boolean)), c: CC_A[Byte, CC_B[Int, Int]]) extends T_B[T_B[Byte]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
}
}