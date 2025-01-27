package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (T_A,Byte), c: T_B[Int]) extends T_A
case class CC_B(a: (T_B[CC_A],T_B[CC_A]), b: T_A, c: T_B[((Int,Char),Boolean)]) extends T_B[CC_A]
case class CC_C(a: T_B[CC_B], b: CC_B, c: CC_B) extends T_B[CC_A]
case class CC_D(a: CC_C, b: T_B[CC_A]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, _, _), _) => 0 
  case CC_B((CC_B(_, _, _),CC_C(_, _, _)), CC_A(_, _, _), _) => 1 
  case CC_B((CC_B(_, _, _),CC_D(_, _)), CC_A(_, _, _), _) => 2 
  case CC_B((CC_C(_, _, _),CC_B(_, _, _)), CC_A(_, _, _), _) => 3 
  case CC_B((CC_C(_, _, _),CC_C(_, _, _)), CC_A(_, _, _), _) => 4 
  case CC_B((CC_C(_, _, _),CC_D(_, _)), CC_A(_, _, _), _) => 5 
  case CC_B((CC_D(_, _),CC_B(_, _, _)), CC_A(_, _, _), _) => 6 
  case CC_B((CC_D(_, _),CC_C(_, _, _)), CC_A(_, _, _), _) => 7 
  case CC_B((CC_D(_, _),CC_D(_, _)), CC_A(_, _, _), _) => 8 
  case CC_D(_, _) => 9 
}
}
// This is not matched: CC_C(_, CC_B(_, CC_A(_, _, _), _), _)