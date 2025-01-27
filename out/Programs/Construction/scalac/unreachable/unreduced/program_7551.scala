package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[Int],Int), b: T_B) extends T_A[Int]
case class CC_B(a: T_A[Int], b: T_A[Int], c: T_A[Int]) extends T_A[Int]
case class CC_C(a: T_A[T_A[(Char,Byte)]]) extends T_B
case class CC_D(a: Boolean, b: CC_B, c: T_B) extends T_B
case class CC_E(a: CC_A) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), CC_C(_)) => 0 
  case CC_A((CC_B(_, _, _),_), CC_C(_)) => 1 
  case CC_A((CC_A(_, _),_), CC_D(_, CC_B(_, _, _), CC_C(_))) => 2 
  case CC_A((CC_B(_, _, _),_), CC_D(_, CC_B(_, _, _), CC_C(_))) => 3 
  case CC_A((CC_A(_, _),_), CC_D(_, CC_B(_, _, _), CC_D(_, _, _))) => 4 
  case CC_A((CC_B(_, _, _),_), CC_D(_, CC_B(_, _, _), CC_D(_, _, _))) => 5 
  case CC_A((CC_A(_, _),_), CC_D(_, CC_B(_, _, _), CC_E(_))) => 6 
  case CC_A((CC_B(_, _, _),_), CC_D(_, CC_B(_, _, _), CC_E(_))) => 7 
  case CC_A((CC_A(_, _),_), CC_E(CC_A(_, _))) => 8 
  case CC_A((CC_B(_, _, _),_), CC_E(CC_A(_, _))) => 9 
  case CC_B(_, _, _) => 10 
}
}