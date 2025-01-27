package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Int, D], b: T_A[D, D], c: T_A[Int, D]) extends T_A[Int, D]
case class CC_B[E]() extends T_A[Int, E]
case class CC_C(a: T_A[Int, T_A[Char, (Boolean,Int)]]) extends T_A[Int, CC_A[(Int,Boolean)]]
case class CC_D(a: Boolean) extends T_B[T_A[Int, T_A[Int, CC_C]]]
case class CC_E() extends T_B[CC_A[T_A[(Int,Char), Byte]]]

val v_a: T_A[Int, T_A[Int, CC_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_B())) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_B())) => 3 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_B()) => 4 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 5 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_B())) => 6 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 7 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_B())) => 8 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, CC_B()) => 9 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 10 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_B())) => 11 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 12 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, CC_A(CC_B(), _, CC_B())) => 13 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, CC_B()) => 14 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 15 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_B())) => 16 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 17 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, CC_A(CC_B(), _, CC_B())) => 18 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, CC_B()) => 19 
  case CC_A(CC_B(), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 20 
  case CC_A(CC_B(), _, CC_A(CC_A(_, _, _), _, CC_B())) => 21 
  case CC_A(CC_B(), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 22 
  case CC_A(CC_B(), _, CC_A(CC_B(), _, CC_B())) => 23 
  case CC_A(CC_B(), _, CC_B()) => 24 
  case CC_B() => 25 
}
}