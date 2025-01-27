package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: Int, b: (T_A[(Boolean,Char)],CC_A)) extends T_A[Boolean]
case class CC_C(a: T_A[T_A[Boolean]]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_B(_, (_,CC_A(_))) => 5 
  case CC_C(_) => 6 
}
}