package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D]) extends T_A[D, E]
case class CC_B[G, F](a: F, b: T_A[G, G], c: T_A[G, G]) extends T_A[G, F]
case class CC_C(a: T_A[T_A[Int, Int], Boolean]) extends T_B[(Byte,T_A[Char, (Char,Byte)])]
case class CC_D(a: T_A[(CC_C,Char), T_A[Byte, (Char,Byte)]]) extends T_B[(Byte,T_A[Char, (Char,Byte)])]

val v_a: T_B[(Byte,T_A[Char, (Char,Byte)])] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_C(CC_B(_, CC_A(_), CC_A(_))) => 1 
  case CC_C(CC_B(_, CC_A(_), CC_B(_, _, _))) => 2 
  case CC_C(CC_B(_, CC_B(_, _, _), CC_A(_))) => 3 
  case CC_C(CC_B(_, CC_B(_, _, _), CC_B(_, _, _))) => 4 
  case CC_D(CC_A(_)) => 5 
  case CC_D(CC_B(_, _, _)) => 6 
}
}