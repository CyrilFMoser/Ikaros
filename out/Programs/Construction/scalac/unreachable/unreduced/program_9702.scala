package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[T_A[CC_A]], b: (T_A[Int],T_A[Int])) extends T_A[Int]
case class CC_C[B](a: T_A[Int], b: B, c: B) extends T_A[CC_B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),CC_A())) => 1 
  case CC_B(_, (CC_A(),CC_B(_, _))) => 2 
  case CC_B(_, (CC_B(_, _),CC_A())) => 3 
  case CC_B(_, (CC_B(_, _),CC_B(_, _))) => 4 
}
}