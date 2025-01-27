package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: Int) extends T_A[D]
case class CC_C[E](a: T_A[E]) extends T_A[E]
case class CC_D(a: ((Int,Byte),CC_C[Int])) extends T_B[CC_C[Boolean]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_), _) => 3 
  case CC_C(CC_A(_)) => 4 
  case CC_C(CC_B(_, _)) => 5 
  case CC_C(CC_C(_)) => 6 
}
}