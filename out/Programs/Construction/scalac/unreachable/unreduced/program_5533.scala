package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: Byte, b: ((CC_A,CC_A),T_A[CC_A]), c: CC_A) extends T_A[T_A[Boolean]]
case class CC_C(a: Boolean, b: T_A[T_A[CC_A]], c: (Int,Boolean)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(_, _, (_,_))) => 4 
  case CC_B(_, ((_,_),_), _) => 5 
  case CC_C(true, _, (_,_)) => 6 
  case CC_C(false, _, (_,_)) => 7 
}
}