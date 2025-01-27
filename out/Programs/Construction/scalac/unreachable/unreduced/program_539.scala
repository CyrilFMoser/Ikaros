package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: (CC_A,Char), b: T_A[T_B], c: CC_A) extends T_B
case class CC_C(a: T_B, b: CC_A, c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, _) => 0 
  case CC_C(CC_B(_, _, _), _, _) => 1 
  case CC_C(CC_C(_, _, _), _, _) => 2 
  case CC_C(CC_D(), _, _) => 3 
  case CC_D() => 4 
}
}