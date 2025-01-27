package Program_62 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_B[Int]]
case class CC_C[C](a: Char) extends T_B[C]
case class CC_D[D](a: T_B[D], b: (T_B[CC_B],T_A[CC_B])) extends T_B[D]
case class CC_E() extends T_B[(CC_A,CC_A)]

val v_a: T_B[CC_E] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, (CC_D(_, _),_)) => 1 
}
}
// This is not matched: CC_C(CC_C(CC_B(_)))