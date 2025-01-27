package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: (T_B[Char],Char), c: T_B[B]) extends T_A
case class CC_B(a: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D(a: (T_A,T_B[CC_C]), b: T_B[CC_C], c: CC_A[CC_C]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}