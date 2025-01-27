package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: Boolean, c: (T_A[Byte, Byte],T_A[Int, Char])) extends T_A[C, Char]
case class CC_B() extends T_A[Boolean, Char]
case class CC_C(a: T_A[T_A[Boolean, Char], Char], b: T_A[Boolean, Char], c: T_A[T_A[Boolean, Char], Char]) extends T_A[Boolean, Char]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), _, (_,CC_A(_, _, _))) => 0 
  case CC_A(CC_A(CC_B(), _, (_,_)), _, (_,CC_A(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _, (_,_)), _, (_,CC_A(_, _, _))) => 2 
  case CC_A(CC_B(), _, (_,CC_A(_, _, _))) => 3 
  case CC_A(CC_C(_, _, _), _, (_,CC_A(_, _, _))) => 4 
  case CC_B() => 5 
  case CC_C(_, _, CC_A(_, _, _)) => 6 
}
}