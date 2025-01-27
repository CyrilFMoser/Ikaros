package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Byte]
case class CC_B(a: CC_A) extends T_A[Byte]
case class CC_C(a: (CC_B,T_B[CC_A]), b: CC_B) extends T_A[Byte]
case class CC_D[C](a: CC_C) extends T_B[C]
case class CC_E(a: T_B[CC_A], b: T_B[T_B[CC_A]], c: (T_A[CC_C],T_A[CC_B])) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _)) => 0 
  case CC_E(_, _, (_,_)) => 1 
}
}