package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char, c: C) extends T_A[C, (T_A[Char, (Char,Boolean)],T_A[Int, Char])]
case class CC_B[D]() extends T_A[D, (T_A[Char, (Char,Boolean)],T_A[Int, Char])]
case class CC_C[E](a: Char) extends T_A[E, (T_A[Char, (Char,Boolean)],T_A[Int, Char])]

val v_a: T_A[Boolean, (T_A[Char, (Char,Boolean)],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C('x') => 2 
  case CC_C(_) => 3 
}
}