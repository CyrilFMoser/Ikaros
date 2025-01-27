package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[Char])) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: Char) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(CC_A(_))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_))) => 4 
  case CC_B(CC_C(_)) => 5 
  case CC_C(_) => 6 
}
}