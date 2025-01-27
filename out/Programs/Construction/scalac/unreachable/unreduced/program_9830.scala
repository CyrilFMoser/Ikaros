package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B(a: T_B[Int, CC_A]) extends T_A
case class CC_C[C](a: Boolean, b: C) extends T_B[CC_B, C]
case class CC_D() extends T_B[CC_B, Byte]
case class CC_E(a: CC_C[T_A], b: (Boolean,T_B[CC_B, Byte]), c: CC_B) extends T_B[CC_B, Byte]

val v_a: T_B[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
  case CC_E(CC_C(_, CC_A(_)), (_,CC_C(_, _)), CC_B(_)) => 2 
  case CC_E(CC_C(_, CC_A(_)), (_,CC_D()), CC_B(_)) => 3 
  case CC_E(CC_C(_, CC_A(_)), (_,CC_E(_, _, _)), CC_B(_)) => 4 
  case CC_E(CC_C(_, CC_B(_)), (_,CC_C(_, _)), CC_B(_)) => 5 
  case CC_E(CC_C(_, CC_B(_)), (_,CC_D()), CC_B(_)) => 6 
  case CC_E(CC_C(_, CC_B(_)), (_,CC_E(_, _, _)), CC_B(_)) => 7 
}
}