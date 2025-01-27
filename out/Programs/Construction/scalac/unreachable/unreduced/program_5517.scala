package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[T_A[Char, (Char,Int)], T_A[Char, (Char,Int)]], (Int,Boolean)], c: C) extends T_A[C, (Int,Boolean)]
case class CC_B[E](a: T_A[E, (Int,Boolean)]) extends T_A[E, (Int,Boolean)]

val v_a: T_A[Boolean, (Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, true) => 0 
  case CC_A(_, _, false) => 1 
  case CC_B(CC_A(_, CC_A(_, _, _), _)) => 2 
  case CC_B(CC_A(_, CC_B(_), _)) => 3 
  case CC_B(CC_B(CC_A(_, _, _))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
}
}