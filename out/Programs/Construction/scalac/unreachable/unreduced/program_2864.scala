package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B(a: T_A, b: Int, c: T_A) extends T_A
case class CC_C(a: Char, b: T_B[Int, CC_B], c: CC_B) extends T_A
case class CC_D[C](a: (T_A,CC_C), b: T_A) extends T_B[C, Byte]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _)) => 0 
  case CC_D(_, CC_B(_, _, CC_A(_, _))) => 1 
  case CC_D(_, CC_B(_, _, CC_B(_, _, _))) => 2 
  case CC_D(_, CC_B(_, _, CC_C(_, _, _))) => 3 
  case CC_D(_, CC_C(_, _, CC_B(_, _, _))) => 4 
}
}