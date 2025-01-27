package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: Boolean, c: T_B[T_B[CC_A, T_A], T_B[(Boolean,Byte), CC_A]]) extends T_A
case class CC_C(a: CC_B) extends T_B[T_A, (T_B[CC_B, CC_A],T_A)]
case class CC_D() extends T_B[T_A, (T_B[CC_B, CC_A],T_A)]

val v_a: T_B[T_A, (T_B[CC_B, CC_A],T_A)] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(), _, _)) => 0 
  case CC_D() => 1 
}
}