package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B() extends T_B
case class CC_C(a: (T_B,Boolean)) extends T_B
case class CC_D(a: (T_A[Boolean, T_B],T_B), b: CC_A[CC_C], c: T_A[Boolean, Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),_)) => 1 
  case CC_C((CC_C(_),_)) => 2 
  case CC_C((CC_D(_, _, _),_)) => 3 
  case CC_D((CC_A(_, _, _),CC_B()), CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _)) => 4 
  case CC_D((CC_A(_, _, _),CC_D(_, _, _)), CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _)) => 5 
}
}
// This is not matched: CC_D((CC_A(_, _, _),CC_C(_)), CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _))