package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: Int, c: (T_A[Boolean],Byte)) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: CC_B, b: CC_B, c: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, (CC_A(_, _, _),_)) => 0 
  case CC_A(_, 12, (CC_B(),_)) => 1 
  case CC_A(_, 12, (CC_C(_, _, _),_)) => 2 
  case CC_A(_, _, (CC_A(_, _, _),_)) => 3 
  case CC_A(_, _, (CC_B(),_)) => 4 
  case CC_A(_, _, (CC_C(_, _, _),_)) => 5 
  case CC_B() => 6 
  case CC_C(_, _, CC_A(_, _, (_,_))) => 7 
}
}