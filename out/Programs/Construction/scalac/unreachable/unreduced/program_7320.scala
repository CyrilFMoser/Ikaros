package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[Int],Byte), b: (T_A,T_B[T_A]), c: T_A) extends T_A
case class CC_B(a: T_A, b: Byte) extends T_B[T_A]
case class CC_C(a: Boolean, b: T_A) extends T_B[T_A]
case class CC_D(a: T_B[CC_C]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C(_, CC_A((_,_), (_,_), CC_A(_, _, _))) => 1 
  case CC_D(_) => 2 
}
}