package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char]], b: (T_A[T_B],T_B)) extends T_A[Char]
case class CC_B(a: T_A[((Char,Byte),Boolean)], b: T_A[Char], c: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_B, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, CC_A(_, _), CC_A(_, _)), CC_B(_, CC_A(_, _), CC_A(_, _))) => 1 
  case CC_D(CC_C(), CC_B(_, CC_A(_, _), CC_A(_, _))) => 2 
  case CC_D(CC_D(CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, CC_A(_, _), CC_A(_, _))) => 3 
  case CC_D(CC_D(CC_C(), CC_B(_, _, _)), CC_B(_, CC_A(_, _), CC_A(_, _))) => 4 
  case CC_D(CC_D(CC_D(_, _), CC_B(_, _, _)), CC_B(_, CC_A(_, _), CC_A(_, _))) => 5 
}
}
// This is not matched: CC_B(_, CC_A(_, (_,_)), CC_A(_, (_,_)))