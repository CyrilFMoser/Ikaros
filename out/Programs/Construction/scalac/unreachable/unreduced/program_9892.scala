package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Boolean], b: Byte) extends T_A[E, Boolean]
case class CC_B(a: CC_A[T_A[Boolean, Boolean]], b: (T_A[Char, Int],T_B[Char, Boolean]), c: T_A[T_A[(Char,Char), Boolean], Boolean]) extends T_B[T_A[T_A[Boolean, Boolean], T_B[(Boolean,Byte), Boolean]], Int]
case class CC_C(a: CC_A[CC_A[CC_B]], b: T_A[Boolean, Boolean], c: Byte) extends T_B[T_A[T_A[Boolean, Boolean], T_B[(Boolean,Byte), Boolean]], Int]
case class CC_D(a: Byte, b: T_A[T_B[(Int,Byte), CC_C], Boolean]) extends T_B[T_A[T_A[Boolean, Boolean], T_B[(Boolean,Byte), Boolean]], Int]

val v_a: T_B[T_A[T_A[Boolean, Boolean], T_B[(Boolean,Byte), Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), CC_A(_, _)) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(0, CC_A(CC_A(_, _), _)) => 2 
  case CC_D(_, CC_A(CC_A(_, _), _)) => 3 
}
}