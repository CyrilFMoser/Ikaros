package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: CC_A, b: (T_A[CC_A],Byte), c: CC_A) extends T_A[Boolean]
case class CC_C(a: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_), _) => 1 
  case CC_C(CC_A()) => 2 
  case CC_C(CC_B(_, (_,_), _)) => 3 
  case CC_C(CC_C(_)) => 4 
}
}