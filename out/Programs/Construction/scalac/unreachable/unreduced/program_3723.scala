package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Boolean],T_A[Char]), b: T_A[Boolean], c: T_A[T_A[Char]]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), CC_A(_, _, _), _) => 0 
  case CC_A((CC_B(),_), CC_A(_, _, _), _) => 1 
  case CC_A((CC_A(_, _, _),_), CC_B(), _) => 2 
  case CC_A((CC_B(),_), CC_B(), _) => 3 
  case CC_B() => 4 
}
}