package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, (T_A[(Int,Byte), T_B],T_B)]
case class CC_B(a: T_B, b: (T_A[T_B, Byte],T_B), c: CC_A[T_B]) extends T_B
case class CC_C(a: Boolean, b: CC_A[CC_B], c: T_A[(T_B,Byte), CC_A[CC_B]]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), (_,_), CC_A(_)) => 0 
  case CC_B(CC_C(_, _, _), (_,_), CC_A(_)) => 1 
  case CC_B(CC_D(), (_,_), CC_A(_)) => 2 
  case CC_C(_, _, _) => 3 
  case CC_D() => 4 
}
}