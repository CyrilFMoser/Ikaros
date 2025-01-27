package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte) extends T_A[(Int,T_A[T_B])]
case class CC_B(a: Int, b: (T_A[CC_A],T_A[T_B]), c: T_A[CC_A]) extends T_A[(Int,T_A[T_B])]
case class CC_C(a: CC_A, b: CC_B) extends T_A[(Int,T_A[T_B])]

val v_a: T_A[(Int,T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,_), _) => 1 
  case CC_C(CC_A(_), CC_B(_, (_,_), _)) => 2 
}
}