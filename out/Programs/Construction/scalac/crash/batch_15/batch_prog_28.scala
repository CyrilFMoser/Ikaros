package Program_28 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: Byte) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_A, b: T_A, c: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), 0), _, _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), 0), _, _) => 2 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), _), _, _) => 3 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(_, _, _), 0), _, _) => 4 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), 0), _, _) => 5 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), _), _, _) => 6 
  case CC_A(CC_A(CC_B(_), CC_B(_), 0), _, _) => 7 
  case CC_A(CC_A(CC_B(_), CC_B(_), _), _, _) => 8 
  case CC_A(CC_A(CC_B(_), CC_C(_, _, _), 0), _, _) => 9 
  case CC_A(CC_A(CC_B(_), CC_C(_, _, _), _), _, _) => 10 
  case CC_A(CC_A(CC_C(_, _, _), CC_A(_, _, _), 0), _, _) => 11 
  case CC_A(CC_A(CC_C(_, _, _), CC_A(_, _, _), _), _, _) => 12 
  case CC_A(CC_A(CC_C(_, _, _), CC_B(_), 0), _, _) => 13 
  case CC_A(CC_A(CC_C(_, _, _), CC_B(_), _), _, _) => 14 
  case CC_A(CC_A(CC_C(_, _, _), CC_C(_, _, _), 0), _, _) => 15 
  case CC_A(CC_A(CC_C(_, _, _), CC_C(_, _, _), _), _, _) => 16 
  case CC_A(CC_B(_), _, _) => 17 
  case CC_A(CC_C(CC_A(_, _, _), _, _), _, _) => 18 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _)) => 19 
  case CC_B(CC_A(CC_B(_), CC_A(_, _, _), _)) => 20 
  case CC_B(CC_A(CC_C(_, _, _), CC_A(_, _, _), _)) => 21 
  case CC_B(CC_A(CC_A(_, _, _), CC_B(_), _)) => 22 
  case CC_B(CC_A(CC_B(_), CC_B(_), _)) => 23 
  case CC_B(CC_A(CC_C(_, _, _), CC_B(_), _)) => 24 
  case CC_B(CC_A(CC_A(_, _, _), CC_C(_, _, _), _)) => 25 
  case CC_B(CC_A(CC_B(_), CC_C(_, _, _), _)) => 26 
  case CC_B(CC_A(CC_C(_, _, _), CC_C(_, _, _), _)) => 27 
  case CC_B(CC_B(CC_A(_, _, _))) => 28 
  case CC_B(CC_B(CC_B(_))) => 29 
  case CC_B(CC_B(CC_C(_, _, _))) => 30 
  case CC_B(CC_C(_, _, _)) => 31 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 32 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(_), _), CC_A(_, _, _), _) => 33 
  case CC_C(CC_A(CC_A(_, _, _), CC_C(_, _, _), _), CC_A(_, _, _), _) => 34 
  case CC_C(CC_A(CC_B(_), CC_A(_, _, _), _), CC_A(_, _, _), _) => 35 
  case CC_C(CC_A(CC_B(_), CC_B(_), _), CC_A(_, _, _), _) => 36 
  case CC_C(CC_A(CC_B(_), CC_C(_, _, _), _), CC_A(_, _, _), _) => 37 
  case CC_C(CC_A(CC_C(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 38 
  case CC_C(CC_A(CC_C(_, _, _), CC_B(_), _), CC_A(_, _, _), _) => 39 
  case CC_C(CC_A(CC_C(_, _, _), CC_C(_, _, _), _), CC_A(_, _, _), _) => 40 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B(_), _) => 41 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(_), _), CC_B(_), _) => 42 
  case CC_C(CC_A(CC_A(_, _, _), CC_C(_, _, _), _), CC_B(_), _) => 43 
  case CC_C(CC_A(CC_B(_), CC_A(_, _, _), _), CC_B(_), _) => 44 
  case CC_C(CC_A(CC_B(_), CC_B(_), _), CC_B(_), _) => 45 
  case CC_C(CC_A(CC_B(_), CC_C(_, _, _), _), CC_B(_), _) => 46 
  case CC_C(CC_A(CC_C(_, _, _), CC_A(_, _, _), _), CC_B(_), _) => 47 
  case CC_C(CC_A(CC_C(_, _, _), CC_B(_), _), CC_B(_), _) => 48 
  case CC_C(CC_A(CC_C(_, _, _), CC_C(_, _, _), _), CC_B(_), _) => 49 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(_, _, _), _) => 50 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(_), _), CC_C(_, _, _), _) => 51 
  case CC_C(CC_A(CC_A(_, _, _), CC_C(_, _, _), _), CC_C(_, _, _), _) => 52 
  case CC_C(CC_A(CC_B(_), CC_A(_, _, _), _), CC_C(_, _, _), _) => 53 
  case CC_C(CC_A(CC_B(_), CC_B(_), _), CC_C(_, _, _), _) => 54 
  case CC_C(CC_A(CC_B(_), CC_C(_, _, _), _), CC_C(_, _, _), _) => 55 
  case CC_C(CC_A(CC_C(_, _, _), CC_A(_, _, _), _), CC_C(_, _, _), _) => 56 
  case CC_C(CC_A(CC_C(_, _, _), CC_B(_), _), CC_C(_, _, _), _) => 57 
  case CC_C(CC_A(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(_, _, _), _) => 58 
}
}
// This is not matched: CC_A(CC_A(CC_A(_, _, _), CC_C(_, _, _), _), _, _)