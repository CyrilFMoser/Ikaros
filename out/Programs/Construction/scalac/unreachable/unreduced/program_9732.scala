package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: (T_B[Boolean],Char)) extends T_A[T_A[Int]]
case class CC_B(a: (CC_A,T_B[CC_A]), b: CC_A) extends T_A[T_A[Int]]
case class CC_C[C](a: T_A[C], b: CC_A) extends T_B[C]
case class CC_D[D](a: CC_B) extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, (_,_))) => 0 
  case CC_D(CC_B(_, _)) => 1 
}
}