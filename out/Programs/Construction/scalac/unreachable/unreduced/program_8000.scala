package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (T_A,T_A)], b: T_B[Boolean, ((Char,Byte),T_A)], c: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_A, b: T_B[C, Int]) extends T_B[C, Int]
case class CC_D[D]() extends T_B[D, Int]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(CC_A(_, _, _), CC_D())) => 0 
  case CC_C(_, CC_C(CC_B(), CC_C(_, _))) => 1 
  case CC_C(_, CC_C(CC_B(), CC_D())) => 2 
  case CC_C(_, CC_D()) => 3 
  case CC_D() => 4 
}
}
// This is not matched: CC_C(_, CC_C(CC_A(_, _, _), CC_C(_, _)))