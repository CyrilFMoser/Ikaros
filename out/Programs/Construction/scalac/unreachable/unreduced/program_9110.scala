package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[T_A]], c: Byte) extends T_A
case class CC_B(a: T_B[(Int,CC_A)], b: T_A) extends T_A
case class CC_C(a: T_B[Char]) extends T_A
case class CC_D(a: T_A, b: CC_A) extends T_B[Char]
case class CC_E(a: T_B[((Char,Byte),CC_C)], b: CC_A, c: (Int,T_B[T_A])) extends T_B[Char]
case class CC_F(a: CC_E, b: (CC_B,T_B[Char])) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, CC_A(CC_A(_, _, _), _, _), (_,_)) => 1 
  case CC_E(_, CC_A(CC_B(_, _), _, _), (_,_)) => 2 
  case CC_E(_, CC_A(CC_C(_), _, _), (_,_)) => 3 
  case CC_F(_, (CC_B(_, _),CC_D(_, _))) => 4 
  case CC_F(_, (CC_B(_, _),CC_F(_, _))) => 5 
}
}
// This is not matched: CC_F(_, (CC_B(_, _),CC_E(_, _, _)))