package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[T_A[D], D], c: (T_A[Char],T_B[Byte, Int])) extends T_A[D]
case class CC_B[E, F](a: T_A[E], b: Boolean, c: T_A[F]) extends T_A[E]
case class CC_C[G](a: T_A[G], b: T_A[T_A[G]]) extends T_A[G]
case class CC_D(a: ((Char,Int),Boolean)) extends T_B[Char, T_A[CC_A[Byte]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),_)) => 0 
  case CC_A(_, _, (CC_B(_, _, _),_)) => 1 
  case CC_A(_, _, (CC_C(_, _),_)) => 2 
  case CC_B(CC_A(_, _, _), _, _) => 3 
  case CC_B(CC_B(CC_A(_, _, _), _, _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 5 
  case CC_B(CC_B(CC_C(_, _), _, _), _, _) => 6 
  case CC_B(CC_C(_, _), _, _) => 7 
  case CC_C(_, _) => 8 
}
}