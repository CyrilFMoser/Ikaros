package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C, c: T_A[Int, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: ((Char,Byte),T_A[Boolean, Boolean])) extends T_A[Int, D]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(false, _, CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_A(true, _, CC_A(_, _, CC_B(_, _))) => 2 
  case CC_A(false, _, CC_A(_, _, CC_B(_, _))) => 3 
  case CC_A(true, _, CC_B(CC_A(_, _, _), (_,_))) => 4 
  case CC_A(false, _, CC_B(CC_A(_, _, _), (_,_))) => 5 
  case CC_A(true, _, CC_B(CC_B(_, _), (_,_))) => 6 
  case CC_A(false, _, CC_B(CC_B(_, _), (_,_))) => 7 
  case CC_B(_, ((_,_),_)) => 8 
}
}