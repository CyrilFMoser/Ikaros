package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_B[T_A]
case class CC_C(a: T_A, b: (T_B[CC_B],CC_B), c: T_A) extends T_B[T_A]
case class CC_D(a: T_B[T_B[Byte]], b: T_B[T_B[CC_B]], c: Byte) extends T_B[Byte]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _, _))) => 1 
  case CC_B(CC_C(_, _, _)) => 2 
  case CC_C(_, (_,CC_B(_)), CC_A(CC_A(_))) => 3 
}
}