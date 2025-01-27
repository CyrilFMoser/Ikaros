package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Int], b: T_A[Int], c: T_B[T_B[Int, Byte], T_B[Char, Char]]) extends T_A[Int]
case class CC_B(a: T_A[T_B[CC_A, (Int,Boolean)]]) extends T_A[Int]
case class CC_C(a: CC_A) extends T_A[Int]
case class CC_D(a: T_B[Boolean, CC_B], b: T_B[CC_B, (CC_B,CC_B)], c: T_B[CC_A, CC_A]) extends T_B[(CC_A,CC_C), (Boolean,T_B[Byte, CC_C])]
case class CC_E(a: Byte, b: CC_B, c: CC_B) extends T_B[(CC_A,CC_C), (Boolean,T_B[Byte, CC_C])]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_B(_), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 2 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_A(_, _, _), _), _) => 3 
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_B(_), CC_A(_, _, _), _), _) => 5 
  case CC_A(CC_A(_, _, _), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 6 
  case CC_A(CC_B(_), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 7 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_C(_), CC_A(_, _, _), _), _) => 8 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_B(_), _), _) => 9 
  case CC_A(CC_B(_), CC_A(CC_A(_, _, _), CC_B(_), _), _) => 10 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), _), _) => 11 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_B(_), _), _) => 12 
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_B(_), _), _) => 13 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_B(_), CC_B(_), _), _) => 14 
  case CC_A(CC_A(_, _, _), CC_A(CC_C(_), CC_B(_), _), _) => 15 
  case CC_A(CC_B(_), CC_A(CC_C(_), CC_B(_), _), _) => 16 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_C(_), CC_B(_), _), _) => 17 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 18 
  case CC_A(CC_B(_), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 19 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(_), _), _) => 20 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_), CC_C(_), _), _) => 21 
  case CC_A(CC_B(_), CC_A(CC_B(_), CC_C(_), _), _) => 22 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_B(_), CC_C(_), _), _) => 23 
  case CC_A(CC_A(_, _, _), CC_A(CC_C(_), CC_C(_), _), _) => 24 
  case CC_A(CC_B(_), CC_A(CC_C(_), CC_C(_), _), _) => 25 
  case CC_A(CC_C(CC_A(_, _, _)), CC_A(CC_C(_), CC_C(_), _), _) => 26 
  case CC_A(CC_A(_, _, _), CC_B(_), _) => 27 
  case CC_A(CC_B(_), CC_B(_), _) => 28 
  case CC_A(CC_C(CC_A(_, _, _)), CC_B(_), _) => 29 
  case CC_A(CC_A(_, _, _), CC_C(_), _) => 30 
  case CC_A(CC_B(_), CC_C(_), _) => 31 
  case CC_A(CC_C(CC_A(_, _, _)), CC_C(_), _) => 32 
  case CC_B(_) => 33 
  case CC_C(_) => 34 
}
}